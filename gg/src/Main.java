import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alarma Alarm=new Alarma();
		Main m=  new Main();
		Scanner teclado= new Scanner(System.in);
		System.out.println("La alarma esta encedida? 1=Si 2=No");
		int encendida = 0;
		encendida=teclado.nextInt();
		if(encendida==1){
			
			System.out.println("Entonces esta sonando, la alarma funciona");
			m.main(null);
		}else{
			System.out.println("Empezamos a comprobar el funcionamiento ");
		
			Alarm.Alarm();
		
			teclado.close();	
	}

}
}
