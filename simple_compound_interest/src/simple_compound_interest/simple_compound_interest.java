package simple_compound_interest;

public class simple_compound_interest {
	public int calculateComp(int p,int r,int t,int n) {
		double comp=0;
		comp=p*Math.pow((1+(r/t)),n*t);
		return (int)comp;
	}
	public int calculateSimple(int p, int r, int t) {
		float simp=(p* r* t) / 100;
		return (int)simp;
	}
}
