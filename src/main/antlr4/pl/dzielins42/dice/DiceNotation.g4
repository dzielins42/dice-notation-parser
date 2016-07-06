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
  :  expr=intExpr  { $value = $expr.value; }
  ;
  
intExpr returns [int value]
  :  expr=intAdditionExpr  { $value = $expr.value; }
  ;

intAdditionExpr returns [int value]
  :  o1=intMultiplyExpr  { $value = $o1.value; }
     ( ADDITION o2=intMultiplyExpr  { $value += $o2.value; }
     | SUBSTRACTION o2=intMultiplyExpr  { $value -= $o2.value; }
     )*
  ;

intMultiplyExpr returns [int value]
  :  o1=intAtomExpr  { $value = $o1.value; }
     ( MULTIPLICATION o2=intAtomExpr  { $value *= $o2.value; }
     )*
  ;

intAtomExpr returns [int value]
  :  n=Number  { $value = Integer.parseInt($n.text); }
  |  br=baseRoll  { $value = $br.value; }
  |  '(' expr=intExpr ')'  { $value = $expr.value; }
  ;

baseRoll returns [int value]
  :  (a=Number)?D(b=Number)
    {
        int x, y, v;
        int sum = 0;
        x = ($a != null) ? Integer.parseInt($a.text) : 1;
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

D
  :  'd'|'D'
  ;

ADDITION
  : '+'
  ;

SUBSTRACTION
  :  '-'
  ;

MULTIPLICATION
  : '*'
  ;