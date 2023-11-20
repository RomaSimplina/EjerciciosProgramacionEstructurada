import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int vectora2D[] = new int[2];
        int vectorb2D[] = new int[2];
        int vectora3D[] = new int[3];
        int vectorb3D[] = new int[3];

        byte opcion, decision;

        do {
            System.out.println("Seleccione: 1.vectores en 2D\t2.vectores en 3D");
            opcion = lector.nextByte();
        } while (opcion != 1 || opcion != 2);

        do {
            System.out.println("Seleccione el tipo de operación con la que desea trabajar:");
            System.out.print(
                    "1.suma de vectores\n2.Resta de vectores\n3.El opuesto de un vector\n4.Producto de un escalar por un vector");
            System.out.print(
                    "5.Producto punto o producto escalar entre vectores\n6.Determinar si son vectores paralelos");
            System.out.print(
                    "7.Determinar si son vectores ortogonales\n8.Determinar la proyección de un vector sobre otro vector");
            System.out.print("9.Producto vectorial o producto cruz");
            decision = lector.nextByte();
        } while (decision <= 0 || decision > 9);

        switch (opcion) {
            case 1 -> {
                switch (decision) {
                    case 1 -> {
                        System.out.println("proporcionar valores al primer vector");
                        System.out.print("x:");
                        vectora2D[1] = lector.nextInt();
                        System.out.print("y:");
                        vectora2D[2] = lector.nextInt();

                        System.out.println("proporcionar valores al segundo vector");
                        System.out.print("x:");
                        vectorb2D[1] = lector.nextInt();
                        System.out.print("y:");
                        vectorb2D[2] = lector.nextInt();
                        int sumav1 = vectora2D[1] + vectorb2D[1];
                        int sumav2 = vectora2D[2] + vectorb2D[2];
                        System.out.println(
                                "La suma de los vectores nos da como resultado (" + (sumav1) + "," + (sumav2) + ").");

                    }

                    case 2 -> {
                        System.out.println("proporcionar valores al primer vector");
                        System.out.print("x:");
                        vectora2D[1] = lector.nextInt();
                        System.out.print("y:");
                        vectora2D[2] = lector.nextInt();

                        System.out.println("proporcionar valores al segundo vector");
                        System.out.print("x:");
                        vectorb2D[1] = lector.nextInt();
                        System.out.print("y:");
                        vectorb2D[2] = lector.nextInt();
                        int restav1 = vectora2D[1] - vectorb2D[1];
                        int restav2 = vectora2D[2] - vectorb2D[2];
                        System.out.println("La resta de los vectores nos da como resultado (" + (restav1) + ","
                                + (restav2) + ").");

                    }
                    case 3 -> {
                        System.out.println("proporcionar valores al  vector");
                        System.out.print("x:");
                        vectora2D[1] = lector.nextInt();
                        System.out.print("y:");
                        vectora2D[2] = lector.nextInt();

                        System.out.println(
                                "Opuesto del vector: (" + (vectora2D[1] * -1) + "," + (vectora2D[2] * -1) + ").");

                    }

                    case 4 -> {
                        System.out.println("proporcionar valores al  vector");
                        System.out.print("x:");
                        vectora2D[1] = lector.nextInt();
                        System.out.print("y:");
                        vectora2D[2] = lector.nextInt();
                        System.out.println("Escalar:");
                        int escalar = lector.nextInt();
                        for (int i = 0; i < 3; i++) {
                            vectora2D[i] = vectora2D[i] * escalar;
                        }
                        System.out.println("Resultado: " + vectora2D[1] + "," + vectora2D[2] + ").");
                    }

                    case 5 -> {
                        System.out.println("proporcionar valores al primer vector");
                        System.out.print("x:");
                        vectora2D[1] = lector.nextInt();
                        System.out.print("y:");
                        vectora2D[2] = lector.nextInt();

                        System.out.println("proporcionar valores al segundo vector");
                        System.out.print("x:");
                        vectorb2D[1] = lector.nextInt();
                        System.out.print("y:");
                        vectorb2D[2] = lector.nextInt();
                        int productov1 = vectora2D[1] * vectorb2D[1];
                        int productov2 = vectora2D[2] * vectorb2D[2];
                        System.out.println("Producto punto: " + (productov1 + productov2));

                    }

                    case 6 -> {
                        System.out.println("proporcionar valores al primer vector");
                        System.out.print("x:");
                        vectora2D[1] = lector.nextInt();
                        System.out.print("y:");
                        vectora2D[2] = lector.nextInt();

                        System.out.println("proporcionar valores al segundo vector");
                        System.out.print("x:");
                        vectorb2D[1] = lector.nextInt();
                        System.out.print("y:");
                        vectorb2D[2] = lector.nextInt();
                        int productov1 = vectora2D[1] * vectorb2D[1];
                        int productov2 = vectora2D[2] * vectorb2D[2];
                        int productopunto = productov1 + productov2;

                        if (productopunto == 0) {
                            System.out.println("Los vectores son paralelos");
                        } else {
                            System.out.println("Los vectores no son paralelos");
                        }
                    }

                    case 7 -> {
                        System.out.println("proporcionar valores al primer vector");
                        System.out.print("x:");
                        vectora2D[1] = lector.nextInt();
                        System.out.print("y:");
                        vectora2D[2] = lector.nextInt();

                        System.out.println("proporcionar valores al segundo vector");
                        System.out.print("x:");
                        vectorb2D[1] = lector.nextInt();
                        System.out.print("y:");
                        vectorb2D[2] = lector.nextInt();
                        int productov1 = vectora2D[1] * vectorb2D[1];
                        int productov2 = vectora2D[2] * vectorb2D[2];
                        int productopunto = productov1 + productov2;

                        if (productopunto == 0) {
                            System.out.println("Los vectores son ortogonales");
                        } else {
                            System.out.println("Los vectores no son ortogonales");
                        }
                    }

                    case 8 -> {
                        System.out.println("proporcionar valores al primer vector");
                        System.out.print("x:");
                        vectora2D[1] = lector.nextInt();
                        System.out.print("y:");
                        vectora2D[2] = lector.nextInt();

                        System.out.println("proporcionar valores al segundo vector");
                        System.out.print("x:");
                        vectorb2D[1] = lector.nextInt();
                        System.out.print("y:");
                        vectorb2D[2] = lector.nextInt();
                        int productov1 = vectora2D[1] * vectorb2D[1];
                        int productov2 = vectora2D[2] * vectorb2D[2];
                        int productopunto = productov1 + productov2;
                        double magnitudB = Math.sqrt(Math.pow(productov1, 2) + Math.pow(productov2, 2));
                        double result = productopunto / magnitudB;

                        for (int i = 0; i < 2; i++) {
                            vectorb2D[i] = (int) (vectorb2D[i] * result);
                        }
                        System.out.println("Proyeccion del primer vector sobre el segundo: (" + vectorb2D[1] + ","
                                + vectorb2D[2] + ").");
                    }

                    case 9 -> {
                        System.out.println("proporcionar valores al primer vector");
                        System.out.print("x:");
                        vectora2D[1] = lector.nextInt();
                        System.out.print("y:");
                        vectora2D[2] = lector.nextInt();

                        System.out.println("proporcionar valores al segundo vector");
                        System.out.print("x:");
                        vectorb2D[1] = lector.nextInt();
                        System.out.print("y:");
                        vectorb2D[2] = lector.nextInt();
                        int det = vectora2D[1] * vectorb2D[2] - vectora2D[2] * vectorb2D[1];

                        System.out.println("Producto vectorial: (" + det + ",0).");
                    }
                }
            }
            case 2 -> {
                switch (decision) {
                    case 1 -> {
                        System.out.println("proporcionar valores al primer vector");
                        System.out.print("x:");
                        vectora3D[1] = lector.nextInt();
                        System.out.print("y:");
                        vectora3D[2] = lector.nextInt();
                        System.out.print("z:");
                        vectora3D[3] = lector.nextInt();

                        System.out.println("proporcionar valores al segundo vector");
                        System.out.print("x:");
                        vectorb3D[1] = lector.nextInt();
                        System.out.print("y:");
                        vectorb3D[2] = lector.nextInt();
                        System.out.print("z:");
                        vectorb3D[3] = lector.nextInt();
                        int sumav1 = vectora3D[1] + vectorb3D[1];
                        int sumav2 = vectora3D[2] + vectorb3D[2];
                        int sumav3 = vectora3D[3] + vectorb3D[3];
                        System.out.println("La suma de los vectores nos da como resultado (" + (sumav1) + "," + (sumav2)
                                + "," + (sumav3) + ").");

                    }

                    case 2 -> {
                        System.out.println("proporcionar valores al primer vector");
                        System.out.print("x:");
                        vectora3D[1] = lector.nextInt();
                        System.out.print("y:");
                        vectora3D[2] = lector.nextInt();
                        System.out.print("z:");
                        vectora3D[3] = lector.nextInt();

                        System.out.println("proporcionar valores al segundo vector");
                        System.out.print("x:");
                        vectorb3D[1] = lector.nextInt();
                        System.out.print("y:");
                        vectorb3D[2] = lector.nextInt();
                        System.out.print("z:");
                        vectorb3D[3] = lector.nextInt();
                        int restav1 = vectora3D[1] - vectorb3D[1];
                        int restav2 = vectora3D[2] - vectorb3D[2];
                        int restav3 = vectora3D[3] - vectorb3D[3];
                        System.out.println("La resta de los vectores nos da como resultado (" + (restav1) + ","
                                + (restav2) + "," + (restav3) + ").");

                    }

                    case 3 -> {
                        System.out.println("proporcionar valores al  vector");
                        System.out.print("x:");
                        vectora3D[1] = lector.nextInt();
                        System.out.print("y:");
                        vectora3D[2] = lector.nextInt();
                        System.out.print("z:");
                        vectora3D[3] = lector.nextInt();

                        System.out.println("Opuesto del vector: (" + (vectora3D[1] * -1) + "," + (vectora3D[2] * -1)
                                + "," + (vectora3D[3] * -1) + ").");

                    }

                    case 4 -> {
                        System.out.println("proporcionar valores al  vector");
                        System.out.print("x:");
                        vectora3D[1] = lector.nextInt();
                        System.out.print("y:");
                        vectora3D[2] = lector.nextInt();
                        System.out.print("z:");
                        vectora3D[3] = lector.nextInt();
                        System.out.print("Escalar:");
                        int escalar = lector.nextInt();
                        for (int i = 0; i < 3; i++) {
                            vectora3D[i] = vectora3D[i] * escalar;
                        }
                        System.out
                                .println("Resultado: " + vectora3D[1] + "," + vectora3D[2] + "," + vectora3D[3] + ").");

                    }

                    case 5 -> {
                        System.out.println("proporcionar valores al primer vector");
                        System.out.print("x:");
                        vectora3D[1] = lector.nextInt();
                        System.out.print("y:");
                        vectora3D[2] = lector.nextInt();
                        System.out.print("z:");
                        vectora3D[3] = lector.nextInt();

                        System.out.println("proporcionar valores al segundo vector");
                        System.out.print("x:");
                        vectorb3D[1] = lector.nextInt();
                        System.out.print("y:");
                        vectorb3D[2] = lector.nextInt();
                        System.out.print("z:");
                        vectorb3D[3] = lector.nextInt();
                        int productov1 = vectora3D[1] * vectorb3D[1];
                        int productov2 = vectora3D[2] * vectorb3D[2];
                        int productov3 = vectora3D[3] * vectorb3D[3];
                        System.out.println("Producto punto: " + (productov1 + productov2 + productov3));
                    }

                    case 6 -> {
                        System.out.println("proporcionar valores al primer vector");
                        System.out.print("x:");
                        vectora3D[1] = lector.nextInt();
                        System.out.print("y:");
                        vectora3D[2] = lector.nextInt();
                        System.out.print("z:");
                        vectora3D[3] = lector.nextInt();

                        System.out.println("proporcionar valores al segundo vector");
                        System.out.print("x:");
                        vectorb3D[1] = lector.nextInt();
                        System.out.print("y:");
                        vectorb3D[2] = lector.nextInt();
                        System.out.print("z:");
                        vectorb3D[3] = lector.nextInt();
                        int productov1 = vectora3D[1] * vectorb3D[1];
                        int productov2 = vectora3D[2] * vectorb3D[2];
                        int productov3 = vectora3D[3] * vectorb3D[3];
                        int productopunto = productov1 + productov2 + productov3;

                        if (productopunto == 0) {
                            System.out.println("Los vectores son paralelos");
                        } else {
                            System.out.println("Los vectores no son paralelos");
                        }
                    }

                    case 7 -> {
                        System.out.println("proporcionar valores al primer vector");
                        System.out.print("x:");
                        vectora3D[1] = lector.nextInt();
                        System.out.print("y:");
                        vectora3D[2] = lector.nextInt();
                        System.out.print("z:");
                        vectora3D[3] = lector.nextInt();

                        System.out.println("proporcionar valores al segundo vector");
                        System.out.print("x:");
                        vectorb3D[1] = lector.nextInt();
                        System.out.print("y:");
                        vectorb3D[2] = lector.nextInt();
                        System.out.print("z:");
                        vectorb3D[3] = lector.nextInt();
                        int productov1 = vectora3D[1] * vectorb3D[1];
                        int productov2 = vectora3D[2] * vectorb3D[2];
                        int productov3 = vectora3D[3] * vectorb3D[3];
                        int productopunto = productov1 + productov2 + productov3;

                        if (productopunto == 0) {
                            System.out.println("Los vectores son ortogonales");
                        } else {
                            System.out.println("Los vectores no son ortogonales");
                        }
                    }

                    case 8 -> {
                        System.out.println("proporcionar valores al primer vector");
                        System.out.print("x:");
                        vectora3D[1] = lector.nextInt();
                        System.out.print("y:");
                        vectora3D[2] = lector.nextInt();
                        System.out.print("z:");
                        vectora3D[3] = lector.nextInt();

                        System.out.println("proporcionar valores al segundo vector");
                        System.out.print("x:");
                        vectorb3D[1] = lector.nextInt();
                        System.out.print("y:");
                        vectorb3D[2] = lector.nextInt();
                        System.out.print("z:");
                        vectorb3D[3] = lector.nextInt();
                        int productov1 = vectora3D[1] * vectorb3D[1];
                        int productov2 = vectora3D[2] * vectorb3D[2];
                        int productov3 = vectora3D[3] * vectorb3D[3];
                        int productopunto = productov1 + productov2 + productov3;
                        double magnitudB = Math
                                .sqrt(Math.pow(productov1, 2) + Math.pow(productov2, 2) + Math.pow(productov3, 2));
                        double result = productopunto / magnitudB;

                        for (int i = 0; i < 3; i++) {
                            vectorb3D[i] = (int) (vectorb3D[i] * result);
                        }
                        System.out.println("Proyeccion del primer vector sobre el segundo: (" + vectorb3D[1] + ","
                                + vectorb3D[2] + "," + vectorb3D[3] + ").");

                    }

                    case 9 -> {
                        System.out.println("proporcionar valores al primer vector");
                        System.out.print("x:");
                        vectora3D[1] = lector.nextInt();
                        System.out.print("y:");
                        vectora3D[2] = lector.nextInt();
                        System.out.print("z:");
                        vectora3D[3] = lector.nextInt();

                        System.out.println("proporcionar valores al segundo vector");
                        System.out.print("x:");
                        vectorb3D[1] = lector.nextInt();
                        System.out.print("y:");
                        vectorb3D[2] = lector.nextInt();
                        System.out.print("z:");
                        vectorb3D[3] = lector.nextInt();
                        int i = vectora3D[2] * vectorb3D[3] - vectora3D[3] * vectorb3D[2];
                        int j = vectora3D[3] * vectorb3D[1] - vectora3D[1] * vectora3D[3];
                        int k = vectora3D[1] * vectorb3D[2] - vectora3D[2] * vectorb3D[1];

                        System.out.println("Producto Vectorial: (" + i + "," + j + "," + k + ").");
                    }
                }
            }
        }

        lector.close();
    }
}
