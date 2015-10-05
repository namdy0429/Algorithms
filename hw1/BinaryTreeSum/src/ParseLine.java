public class ParseLine {
	String line;				//string in the line
	int id;						//index in the line
	int temp_num;
	
	//constructor
	public ParseLine(String l){
		this.line = l;
		this.id = 0;
	}
	
	public Integer getNextLex(){
	//everytime when this function is called, return one lexeme
				
		int result = 0;
		char ch;
		char next_ch;
		
		while(true) {
			if (id+1 == this.line.length()) {		// return -5 at the end of the line
				result = -5;
				break;
			}
			else {
				ch = this.line.charAt(id);
				next_ch = this.line.charAt(id+1);
				
				if (ch == '(') {				//when '(', return -3
					result = -3;
					break;
				}
				else if (ch == ')') {			//when ')', return -4
					result = -4;
					break;
				}
				else if (Character.isDigit(ch)) {	
				//when number, wait until the number's end, return one integer
					if (Character.isDigit(next_ch)){		// multiple digits number
						this.temp_num = this.temp_num * 10 + Character.getNumericValue(ch);
						this.id++;
					}
					else {								// one digit number & last digit
						result = this.temp_num * 10 + Character.getNumericValue(ch);
						this.temp_num = 0;
						break;
					}
				}
				else {
					this.id++;
				}
			}
		}
		this.id++;
		return result;
	}
	
}
