package prep;

public class Y extends X{

	final int Yi, Yj;
	public Y() {
		// TODO Auto-generated constructor stub
		Yi = super.i;
		Yj = super.k;
		System.out.println("Inside Y constructor...");
	}
	
	public int[] nextNumOfYij(int i, int j) {
		int[] z = new int[3];
		z[0] = i+1;
		z[1] = j+1;
		return z;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Y y = new Y();
        int[] z =  y.nextNumOfYij(y.Yi, y.Yj);
        for(int i=0; i<z.length; i++) {
        	System.out.println("Value at z: "+z[i]);
        }
	}

}
