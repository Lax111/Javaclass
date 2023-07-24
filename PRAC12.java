package test2;

public class PRAC12 {

	public static void main(String[] args) {

		Team te = new Team();
		te.Groupa();
		te.Groupb();
		te.jump();
		te.kick();
		te.run();
	}

}

interface football {
	public void run();

}

interface football1 {
	public void jump();

}

interface football2 {
	public void kick();

}

class Group {
	public void Groupa() {
		System.out.println("group1");

	}

	public void Groupb() {
		System.out.println("group2");
	}
}

class Team extends Group implements football, football1, football2 {

	@Override
	public void kick() {
		System.out.println("kickball");

	}

	@Override
	public void jump() {
		System.out.println("highjump");

	}

	@Override
	public void run() {
		System.out.println("runfast");

	}

}
