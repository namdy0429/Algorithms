package FFT;

public class complex {
	private double real_part;
	private double imaginary_part;
	public complex(double rp, double ip){
		this.real_part = rp;
		this.imaginary_part = ip;
	}
	public void setRP(double _rp){
		real_part = _rp; 
	}
	public void setIP(double _ip){
		imaginary_part = _ip;
	}
	public double getRP(){
		return real_part;
	}
	public double getIP(){
		return imaginary_part;
	}
	public String toString(){
		return real_part + "+" + imaginary_part + "i";
	}
	public complex addComplex(complex c1, complex c2){
		complex result = new complex(c1.getRP()+c2.getRP(), c1.getIP()+c2.getIP());
		return result;
	}
	public complex subtractComplex(complex c1, complex c2){
		complex result = new complex(c1.getRP()-c2.getRP(), c1.getIP()-c2.getIP());
		return result;
	}
	
	public complex multiplyComplex(complex c1, complex c2){
		double rp1, rp2;
		double ip1, ip2;
		
		rp1 = c1.getRP();
		rp2 = c2.getRP();
		ip1 = c1.getIP();
		ip2 = c2.getIP();
		
		complex result = new complex(rp1*rp2 - ip1*ip2, rp1*ip2+rp2*ip1);
		return result;
	}
	public void roundUp(){
//		round up the complex to six decimal places
		this.setRP(Math.round(this.getRP()*1000000d)/1000000d);
		this.setIP(Math.round(this.getIP()*1000000d)/1000000d);
	}

}
