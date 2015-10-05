package CollinearPts;

public class Line {
	float slope;
	float inter_x;
	
	Line(){
		this.slope = 0;
		this.inter_x = 0;
	}
	
	Line(int a_x, int a_y, int b_x, int b_y){
		this.slope = calculateSlope(a_x, a_y, b_x, b_y);
		this.inter_x = calculateItsX(a_x, a_y, b_x, b_y);
	}
	
	static float calculateSlope(int a_x, int a_y, int b_x, int b_y){
		return (float) (b_y - a_y) / (float) (b_x - a_x);
	}
	static float calculateItsX(int a_x, int a_y, int b_x, int b_y){
		if ((b_x == a_x) && (b_y != a_y))
			return a_x;
		else
			return (float) a_y - calculateSlope(a_x, a_y, b_x, b_y) * (float) a_x;
	}
	//hashCode() override
	public int hashCode(){
        int hashcode = 17;
        hashcode = 31 * hashcode + Float.floatToIntBits(slope);
        hashcode = 31 * hashcode + Float.floatToIntBits(inter_x);
        return hashcode;
    }
     
    public boolean equals(Object obj){
        if (obj instanceof Line) {
            Line pp = (Line) obj;
            return ((Float.compare(pp.slope, this.slope)==0) && (Float.compare(pp.inter_x, this.inter_x)==0));
        } else {
            return false;
        }
    }
}
