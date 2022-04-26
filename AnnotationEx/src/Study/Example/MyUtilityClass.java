package Study.Example;

import Study.RedSticker;

public class MyUtilityClass {
	
	@RedSticker
	private int num;

	
	
	@RedSticker  //apply sticker on target(bcoz Element type is method)  if we apply it on class it gives error
	public void t1() {
		System.out.println("t1 called");
	}
	public void t2() {
		System.out.println("t2 called");
	}

}
