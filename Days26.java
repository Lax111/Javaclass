package test2;

interface UsBank{
public void Save(int a);
public void Loan(int b);

public class Days26 {

	public static void main(String[] args) {
		
	}

}
class City implements UsBank{

	
	public void Save(int a) {
	System.out.println("This is save method for City");
		
	}


	public void Loan(int b) {
		System.out.println("This is Loan method for City");
		
	}}

class PNCs implements UsBank{

	
	public void Save(int a) {
		System.out.println("This is Loan method for PNCs");
		
	}

	
	public void Loan(int b) {
		System.out.println("This is Loan method for PNCs");
		
	}
}}
