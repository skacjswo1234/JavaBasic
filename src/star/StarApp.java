package star;

public class StarApp {
	public static void main(String[] args) {
		GateWay g1 = new GateWay();
		Protoss z1 =  g1.make(() -> new Zealot("질럿"));
		Protoss d1 = g1.make(() -> new Zealot("드라군"));
		Protoss dk1 = g1.make(() -> new DarkTempler("다크템플러"));
		
		System.out.println(z1.getName());
	}
}
