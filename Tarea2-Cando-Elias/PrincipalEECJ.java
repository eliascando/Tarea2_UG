/** @author (Elias Cando Jaime) 
 * @version (Tarea#2)*/
import java.util.Scanner;
public class PrincipalEECJ{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        InfanteEECJ obj=new InfanteEECJ();
        InfanteEECJ obj2=new InfanteEECJ("Martin",4.6,58,'M');
        String name="",sobrepeso="",name2="",sobrepeso2=""; 
        double weight=0.0, weight2=0.0;
        int height=0, height2=0;
        char sex=' ', sex2=' ';
        int day=0, month=0, year=0, day2=0, month2=0, year2=0;
        double alerta=0.0,age1=0, age2=0;
        System.out.println("Nombre: Elias Cando Jaime \nCurso: SOF-S-MA-2-2 \nFecha: 21 de junio del 2021");
        System.out.print("\n");
        System.out.println("***DATOS DEL INFANTE***");
        System.out.println("-Infante 1-");
        System.out.print("Nombre: "); name=sc.nextLine().trim(); obj.setName(name);
        System.out.print("Sexo: "); sex=sc.nextLine().charAt(0); obj.setSex(sex);
        System.out.print("Altura: "); height=sc.nextInt(); obj.setHeight(height); sc.nextLine();
        System.out.print("Peso: "); weight=sc.nextDouble(); obj.setWeighte(weight); sc.nextLine();
        System.out.print("Numero de día de nacimiento: "); day=sc.nextInt(); obj.setDay(day); sc.nextLine();
        System.out.print("Numero de mes de nacimiento: "); month=sc.nextInt(); obj.setMonth(month); sc.nextLine();
        System.out.print("Numero de anio de nacimiento: "); year=sc.nextInt(); obj.setYear(year); sc.nextLine();
        System.out.println("----------------------------------------------------");
        System.out.println("-Infante 2-");
        System.out.print("Nombre: "); name2=sc.nextLine().trim(); obj2.setName(name2);
        System.out.print("Sexo: "); sex2=sc.nextLine().charAt(0); obj2.setSex(sex2);
        System.out.print("Altura: "); height2=sc.nextInt(); obj2.setHeight(height2); sc.nextLine();
        System.out.print("Peso: "); weight2=sc.nextDouble(); obj2.setWeighte(weight2); sc.nextLine();
        System.out.print("Numero de día de nacimiento: "); day2=sc.nextInt(); obj2.setDay(day2); sc.nextLine();
        System.out.print("Numero de mes de nacimiento: "); month2=sc.nextInt(); obj2.setMonth(month2); sc.nextLine();
        System.out.print("Numero de anio de nacimiento: "); year2=sc.nextInt(); obj2.setYear(year2); sc.nextLine();
        age1=obj.calcularEdad(day,month,year);
        age2=obj2.calcularEdad(day2,month2,year2);
        sobrepeso= obj.sobrePeso(weight);
        alerta=Math.max(weight,weight2);    
        sobrepeso2= obj.sobrePeso(weight2);
        System.out.println("**RESULTADO**");
        if(alerta==weight){
        System.out.println("El infante "+name+" tiene "+age1+" meses de edad\ny segun su peso("+weight+"kg) tiene "+sobrepeso);
        }else if(alerta==weight2){
        System.out.println("El infante "+name2+" tiene "+age2+" meses de edad\ny segun su peso("+weight2+"kg) tiene "+sobrepeso2);
        }
    }
}