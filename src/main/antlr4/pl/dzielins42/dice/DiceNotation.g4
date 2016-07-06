grammar DiceNotation;

@parser::members {

    private java.util.Random _random = new java.util.Random();

    public static int eval(String expression) {
        ANTLRInputStream in = new ANTLRInputStream(expression);
        DiceNotationLexer lexer = new DiceNotationLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DiceNotationParser parser = new DiceNotationParser(tokens);
        return parser.eval().value; 
    }

}

eval returns [int value]
  :  br=baseRoll  {$value = $br.value;} 
  ;

baseRoll returns [int value]
  :  a=Number'd'b=Number
    {
        int x, y, v;
        int sum = 0;
        x = Integer.parseInt($a.text);
        y = Integer.parseInt($b.text);
        for (int i = 0; i < x; i++) {
            v = _random.nextInt(y) + 1;
            sum += v;
        }
        $value = sum;
    }
  ;

Number
  :  ('0'..'9')+
  ;