public class Ejercicio11{
	public static void main (String args[]){

		int par=0;
		int docena=0;
		int grande=0;

		for (int i = 0;i<10 ;i++ ) {
			int numero = (int)(Math.random()*36);
			System.out.print(" # "+numero);
			if (numero==0) {
				
			}else if(numero%2==0){
				par ++;

			}

			if (numero>12 && numero < 25) {
				docena ++;
				
			}
			if (numero > grande) {
				grande = numero;
				
			}

		}
		System.out.println("");
		System.out.println("numero mas grande "+grande);
		System.out.println("cantidad de # pares "+par);
		System.out.println("numeros en segunda docena "+docena);

	}

}