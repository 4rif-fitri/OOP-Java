class Mahasiswa{
	String nama;

	Mahasiswa(String nama){
		this.nama = nama;
		System.out.println("Hai " + this.nama);
		// Main.test();
	}
	void show(){
		System.out.println("Nama " + this.nama );
	}
	void setNAma(String nama){ //setter
		this.nama = nama;
	}
	String getNama(){ //getter
		return this.nama;
	}
	String sayHai(String msg){
		return msg + " dari " + this.nama;
	} 
}
public class Main {
	public static void main(String[] args) {
		Mahasiswa siswa1 = new Mahasiswa("Usop");
		siswa1.show();
		// test();
		siswa1.nama = "Lynax";
		siswa1.show();
		System.out.println(siswa1.getNama());
		System.out.println(siswa1.sayHai("selamat datang"));
	}


	static void test(){ //static boleh dipangil ke kelas
		System.out.println("test");
	}
}
