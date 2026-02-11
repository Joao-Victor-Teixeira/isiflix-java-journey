public class TimeMain {

    public static void main(String[] args) {
		Time t = new Time();
		
		t.setTime(15);
		
		System.out.println(t.exibirHoraUniversal());
		System.out.println(t.exibirHoraPadrao());
	}
}
