package สýื้;

public class Arrays {
	public int[] src_left,src_right,dest_left,dest_right;
	public int length;
	public Arrays(int[] sleft,int[] sright,int[] dleft,int[] dright) {
		this.src_left=sleft;
		this.src_right=sright;
		this.dest_left=dleft;
		this.dest_right=dright;
		if(this.src_right[1]-this.src_left[1]>this.dest_right[1]-this.dest_left[1])
			length=this.dest_right[1]-this.dest_left[1];
		else
			length=this.src_right[1]-this.src_left[1];
	}
	public int[][] copy(int[][] src,int[][] dest) {
		for(int i=this.src_left[0],j=this.dest_left[0];i<=this.src_right[0]&&j<=this.dest_right[0];i++,j++) {
		System.arraycopy(src[i],this.src_left[1],dest[j],this.dest_left[1],length+1);
		}
		return dest;
	}
}
