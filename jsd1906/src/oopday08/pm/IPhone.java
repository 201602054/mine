package oopday08.pm;


public class IPhone extends Phone
               implements Music,Game,Camera{
	
	public IPhone() {
		super("ipod","xr",6500);
	}
	@Override
	public void takePhoto() {
		System.out.println("照1200万像素的照片");
	}

	@Override
	public void start() {
		System.out.println("启动王者荣耀");
	}

	@Override
	public void play() {
		System.out.println("蓝牙耳机听无损音乐");
	}
	
}