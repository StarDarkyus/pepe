import java.util.Scanner;

public class Alarma {

public void Alarm(){
 int tempe = 0; 
 Timbre Timbr=new Timbre();
Main M= new Main();
 Scanner teclado=new Scanner(System.in);
 System.out.println("¿Que temperatura hay?");
 tempe=teclado.nextInt();
if(tempe>=30){
	Timbr.Timbr();
}else{
	System.out.println("No hay una temperatura suficiente para saber si funciona");
M.main(null);
	teclado.close();
}
}
}
