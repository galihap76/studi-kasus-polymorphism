class Dosen{
	protected String nama;
	
	public void absen() {
		System.out.println("Melakukan abses.");
	}
	
	public String getNama() {
		return nama;
	}
	
	public void setNama(String nama) {
		this.nama = nama;
	}
}

class DosenTetap extends Dosen{
	private String nip;
	
	public String getNip() {
		return nip;
	}
	
	public void setNip(String nip) {
		this.nip = nip;
	}
	
	@Override
	public void absen() {
		System.out.println("Absen sidik jari.");
	}
}

class DosenLB extends Dosen{
	
	@Override
	public void absen() {
		System.out.println("Absen tanda tangan");
	}
}

public class Main {

	public static void main(String[] args) {
		
		Dosen dosen1;
		Dosen dosen2;
		
		dosen1 = new DosenTetap();
		dosen1.setNama("Mira Kania");
		System.out.println("Dosen tetap : " + dosen1.getNama());
		dosen1.absen();
		
		dosen2 = new DosenLB();
		dosen2.setNama("Rizki Adam");
		System.out.println("Dosen LB : " + dosen2.getNama());
		dosen2.absen();
	}

}
