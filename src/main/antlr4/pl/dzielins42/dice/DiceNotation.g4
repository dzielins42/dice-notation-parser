grammar DiceNotation;

eval returns [int value]
	:	br=baseRoll	{$value = $br.value;} 
	;

baseRoll returns [int value]
	:	a=Number'd'b=Number	{
								int x, y;
								x = Integer.parseInt($a.text);
								y = Integer.parseInt($b.text);
								$value = x*y;
							}
	;

Number
	:	('0'..'9')+
	;