public class Konie implements Horse{
	public int _size;
	public Konie(int size){
		_size = size;
	}

	public boolean NORazdvoenieLichnosty(){
		return (size == _size);
	}
}// 3