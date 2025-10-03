package teste;

import java.util.Scanner;

public class TarefaQuestoes {

		public static void Q1 () {
			System.out.println("alo mundo");		

		}
		
		public static void Q2 () {
		     Scanner scanner = new Scanner(System.in);

		       System.out.print("Digite um número: ");
		        int numero = scanner.nextInt();
		        System.out.println("O número informado foi: " + numero);

		        scanner.close();
		}
		
		public static void Q3  () {
			 Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite um número: ");
		        int num1 = scanner.nextInt();
			
		        System.out.print("Digite um número: ");
		        int num2 = scanner.nextInt();
		        
		        System.out.print("Digite um número: ");
		        int num3 = scanner.nextInt();
		        
		        System.out.println("A média é: " + (num1+num2+num3)/3 );
		}
		
		
		public static void Q4 () {
			  Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite a metragem em metros quadrados: ");
		        int num1 = scanner.nextInt();
		        
		        System.out.println("A sua metragem em CM é: "+  num1*100);
		}
		
		public static void Q5 () {
			  Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite o raio do circulo: ");
		        int num1 = scanner.nextInt();
		
		        System.out.println("A àrea do seu círculo é: " + (num1*num1)* 3.14 );
		}
		
		public static void Q6 () {
		     Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite o preço do primeiro produto: ");
		        double preco1 = scanner.nextDouble();

		        System.out.print("Digite o preço do segundo produto: ");
		        double preco2 = scanner.nextDouble();

		        System.out.print("Digite o preço do terceiro produto: ");
		        double preco3 = scanner.nextDouble();

		        if (preco1 <= preco2 && preco1 <= preco3) {
		            System.out.println("Você deve comprar o primeiro produto. Preço: R$ " + preco1);
		        } else if (preco2 <= preco1 && preco2 <= preco3) {
		            System.out.println("Você deve comprar o segundo produto. Preço: R$ " + preco2);
		        } else {
		            System.out.println("Você deve comprar o terceiro produto. Preço: R$ " + preco3);
		        }
		}
		
		public static void Q7 () {
			 Scanner scanner = new Scanner(System.in);

		        System.out.print("Quantas notas deseja informar? ");
		        int n = scanner.nextInt();

		        double soma = 0;


		        for (int i = 1; i <= n; i++) {
		            System.out.print("Digite a " + i + "ª nota: ");
		            double nota = scanner.nextDouble();
		            soma += nota;
		        }

		        double media = soma / n;

		        System.out.println("Média final: " + media);

		        if (media >= 7) {
		            System.out.println("Situação: Aprovado");
		        } else {
		            System.out.println("Situação: Reprovado");
		        }
		}
		
		public static void Q8 () {
		    Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a primeira nota: ");
	        double nota1 = scanner.nextDouble();

	        System.out.print("Digite a segunda nota: ");
	        double nota2 = scanner.nextDouble();

	        double mf = (nota1 + nota2) / 2;
	        System.out.println("\nMédia Final (MF) inicial: " + mf);

	        if (mf >= 7) {
	            System.out.println("Situação: Aprovado ");
	        } else if (mf >= 4) {
	            System.out.println("Situação: Precisa fazer AF ");

	            System.out.print("Digite a nota da AF: ");
	            double af = scanner.nextDouble();

	            double mfComAF = (mf + af) / 2;
	            System.out.println("Média Final com AF: " + mfComAF);

	            if (af >= 4 && mfComAF >= 5) {
	                System.out.println("Situação Final: Aprovado ");
	            } else {
	                System.out.println("Situação Final: Reprovado ");
	            }
	        } else {
	            System.out.println("Situação: Reprovado");
	        }	
		}
		
		public static void Q9 () {
			 Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite o primeiro número: ");
		        double num1 = scanner.nextDouble();

		        System.out.print("Digite o segundo número: ");
		        double num2 = scanner.nextDouble();

		        System.out.print("Digite o terceiro número: ");
		        double num3 = scanner.nextDouble();

		        double maior = num1;

		        if (num2 > maior) {
		            maior = num2;
		        }
		        if (num3 > maior) {
		            maior = num3;
		        }

		        System.out.println("O maior número informado é: " + maior);
		}
		
		public static void Q10 () {
			 Scanner scanner = new Scanner(System.in);
			 
			 double numero = 0;

		        System.out.print("Digite o número: ");
		        double num1 = scanner.nextDouble();
		        
		    
		        numero = num1;
		        if(num1 % 2 == 0) {
		        	System.out.println("O número é par");
		        }
		        
		        
		        else {
		        	System.out.println("seu numero é impar");
		        
		        }
		}
		
		public static void Q11 () {
			Scanner scanner = new Scanner(System.in);
	        int numero;

	        do {
	            System.out.print("Digite um número inteiro entre 0 e 10: ");
	            numero = scanner.nextInt();

	            if (numero < 0 || numero > 10) {
	                System.out.println("Número inválido! Tente novamente.");
	            }
	        } while (numero < 0 || numero > 10);

	        System.out.println("\nTabuada de " + numero + ":");

	        for (int i = 0; i <= 10; i++) {
	            System.out.println(numero + " x " + i + " = " + (numero * i));
	        }
		}
		
		public static void Q12 () {
			  Scanner scanner = new Scanner(System.in);
		        double nota;

		        do {
		            System.out.print("Digite uma nota entre 0 e 10: ");
		            nota = scanner.nextDouble();

		            if (nota < 0 || nota > 10) {
		                System.out.println("Valor inválido! Tente novamente.");
		            }

		        } while (nota < 0 || nota > 10);

		        System.out.println("Nota informada: " + nota);
		}
		
		public static void Q13 () {
			public static void q13() {
				  Scanner scanner = new Scanner(System.in);

			        System.out.print("Digite o número total de eleitores: ");
			        int totalEleitores = scanner.nextInt();

			        int votosCandidato1 = 0;
			        int votosCandidato2 = 0;
			        int votosCandidato3 = 0;

			        System.out.println("Votação: Digite 1, 2 ou 3 para votar no candidato correspondente.");

			        for (int i = 1; i <= totalEleitores; i++) {
			            int voto;
			            do {
			                System.out.print("Eleitor " + i + ", digite seu voto: ");
			                voto = scanner.nextInt();

			                if (voto < 1 || voto > 3) {
			                    System.out.println("Voto inválido! Digite 1, 2 ou 3.");
			                }
			            } while (voto < 1 || voto > 3);

			            if (voto == 1) votosCandidato1++;
			            else if (voto == 2) votosCandidato2++;
			            else votosCandidato3++;
			        }

			        System.out.println("\nResultado da eleição:");
			        System.out.println("Candidato 1: " + votosCandidato1 + " voto(s)");
			        System.out.println("Candidato 2: " + votosCandidato2 + " voto(s)");
			        System.out.println("Candidato 3: " + votosCandidato3 + " voto(s)");
				
		}
		
		public static void Q14 () {
			Scanner scanner = new Scanner(System.in);

	        for (int i = 1; i <= 10; i++) {
	            int numero;

	            do {
	                System.out.print("Digite o " + i + "º número (maior que 1): ");
	                numero = scanner.nextInt();

	                if (numero <= 1) {
	                    System.out.println("Número inválido! Digite um número maior que 1.");
	                }
	            } while (numero <= 1);

	            boolean primo = true;
	            for (int j = 2; j <= Math.sqrt(numero); j++) { 
	                if (numero % j == 0) {
	                    primo = false;
	                    break;
	                }
	            }

	            if (primo) {
	                System.out.println(numero + " é um número primo");
	            } else {
	                System.out.println(numero + " não é um número primo");
	            }

	            System.out.println(); 
	        }
		}
		
		public static void Q15 () {
		     int n = 10; 
		        int a = 0, b = 1;

		        System.out.print("Sequência de Fibonacci: ");

		        for (int i = 1; i <= n; i++) {
		            System.out.print(a);

		            if (i < n) {
		                System.out.print("-"); 
		            }

		            int proximo = a + b;
		            a = b;
		            b = proximo;
		        }

		        System.out.println(); 
		}
		
		public static void Q16 () {
			public static void q16() {
		        Scanner scanner = new Scanner(System.in);

		        int numero;

		        do {
		            System.out.print("Digite um número inteiro positivo: ");
		            numero = scanner.nextInt();

		            if (numero < 0) {
		                System.out.println("Número inválido! Tente novamente.");
		            }
		        } while (numero < 0);

		        long fatorial = 1;
		        for (int i = 1; i <= numero; i++) {
		            fatorial *= i;
		        }

		        System.out.println("O fatorial de " + numero + " é: " + fatorial);
		}
		
		public static void Q17 () {
			 Scanner scanner = new Scanner(System.in);

		        int[] numeros = new int[5]; 

		        for (int i = 0; i < numeros.length; i++) {
		            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
		            numeros[i] = scanner.nextInt();
		        }

		        System.out.println("Números informados:");
		        for (int i = 0; i < numeros.length; i++) {
		            System.out.println(numeros[i]);
		        }
		}
		
		public static void Q18 () {
		       Scanner scanner = new Scanner(System.in);

		        double[] numeros = new double[10]; 

		        for (int i = 0; i < numeros.length; i++) {
		            System.out.print("Digite o " + (i + 1) + "º número: ");
		            numeros[i] = scanner.nextDouble();
		        }

		        System.out.println("\nNúmeros na ordem inversa:");
		        for (int i = numeros.length - 1; i >= 0; i--) {
		            System.out.println(numeros[i]);
		        }
		}
		
		public static void Q19 () {
			  Scanner scanner = new Scanner(System.in);

		        int[] numeros = new int[5];
		        int soma = 0;
		        int multiplicacao = 1;

		        for (int i = 0; i < numeros.length; i++) {
		            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
		            numeros[i] = scanner.nextInt();

		            soma += numeros[i];
		            multiplicacao *= numeros[i];
		        }

		        System.out.println("Números informados:");
		        for (int i = 0; i < numeros.length; i++) {
		            System.out.print(numeros[i] + " ");
		        }

		        System.out.println("Soma dos números: " + soma);
		        System.out.println("Multiplicação dos números: " + multiplicacao);
		}
		
		public static void Q20 () {
			Scanner scanner = new Scanner(System.in);

	        int[] numeros = new int[20];
	        int[] par = new int[20];   
	        int[] impar = new int[20]; 
	        int countPar = 0, countImpar = 0;

	        for (int i = 0; i < numeros.length; i++) {
	            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
	            numeros[i] = scanner.nextInt();

	            if (numeros[i] % 2 == 0) {
	                par[countPar] = numeros[i];
	                countPar++;
	            } else {
	                impar[countImpar] = numeros[i];
	                countImpar++;
	            }
	        }

	        System.out.println("\nVetor original:");
	        for (int i = 0; i < numeros.length; i++) {
	            System.out.print(numeros[i] + " ");
	        }

	        System.out.println("\n\nNúmeros pares:");
	        for (int i = 0; i < countPar; i++) {
	            System.out.print(par[i] + " ");
	        }

	        System.out.println("\n\nNúmeros ímpares:");
	        for (int i = 0; i < countImpar; i++) {
	            System.out.print(impar[i] + " ");
	        }
		}
		
		public static void Q21 () {
			public static void q21(){
			      Scanner scanner = new Scanner(System.in);

			        System.out.print("Digite a primeira string: ");
			        String str1 = scanner.nextLine();

			        System.out.print("Digite a segunda string: ");
			        String str2 = scanner.nextLine();

			        System.out.println("Primeira string: " + str1 + " - comprimento: " + str1.length());
			        System.out.println("Segunda string: " + str2 + " - comprimento: " + str2.length());

			        if (str1.length() == str2.length()) {
			            System.out.println("As duas strings possuem o mesmo comprimento.");
			        } else {
			            System.out.println("As duas strings possuem comprimentos diferentes.");
			        }

			        if (str1.equals(str2)) {
			            System.out.println("As duas strings são iguais no conteúdo.");
			        } else {
			            System.out.println("As duas strings são diferentes no conteúdo.");
			        }
		}
		
		public static void Q22 () {
		    Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um número inteiro: ");
	        int numero = scanner.nextInt();

	        int reverso = 0;
	        int temp = numero; 

	        while (temp != 0) {
	            int digito = temp % 10;
	            reverso = reverso * 10 + digito; 
	            temp /= 10;
	        }

	        System.out.println("Número original: " + numero);
	        System.out.println("Número reverso: " + reverso);

		}
		
		public static void Q23 () {
			 Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite o primeiro número: ");
		        double num1 = scanner.nextDouble();

		        System.out.print("Digite o segundo número: ");
		        double num2 = scanner.nextDouble();

		        scanner.nextLine(); 
		        System.out.print("Digite a operação desejada (soma, subtracao, multiplicacao, divisao): ");
		        String operacao = scanner.nextLine().toLowerCase();

		        double resultado;

		        switch (operacao) {
		            case "soma":
		                resultado = num1 + num2;
		                System.out.println("Resultado: " + resultado);
		                break;
		            case "subtracao":
		                resultado = num1 - num2;
		                System.out.println("Resultado: " + resultado);
		                break;
		            case "multiplicacao":
		                resultado = num1 * num2;
		                System.out.println("Resultado: " + resultado);
		                break;
		            case "divisao":
		                if (num2 != 0) {
		                    resultado = num1 / num2;
		                    System.out.println("Resultado: " + resultado);
		                } else {
		                    System.out.println("Erro: divisão por zero não é permitida!");
		                }
		                break;
		            default:
		                System.out.println("Operação inválida!");
		        }
		}
		
	public static void main(String[] args) {
		//execute a questao metodo (nº())

	}

}
