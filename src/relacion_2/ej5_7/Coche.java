package relacion_2.ej5_7;

    public class Coche{
        private String color;
        private String marca;
        private String modelo;
        private String matricula;
        private int numero_c;
        private int numero_p;

        public Coche(String color, String marca, String modelo, String matricula, int numero_c, int numero_p) {
            this.color = color;
            this.marca = marca;
            this.modelo = modelo;
            this.matricula = matricula;
            this.numero_c = numero_c;
            this.numero_p = numero_p;
        }
        @Override
        public String toString() {
            return "Coche{" +
                    "color='" + color + '\'' +
                    ", marca='" + marca + '\'' +
                    ", modelo='" + modelo + '\'' +
                    ", matricula='" + matricula + '\'' +
                    ", numero_c=" + numero_c +
                    ", numero_p=" + numero_p +
                    '}';
        }

        public String getColor() {
            return color;
        }


        public void setColor(String color) {
            this.color = color;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public String getMatricula() {
            return matricula;
        }

        public void setMatricula(String matricula) {
            this.matricula = matricula;
        }

        public int getNumero_c() {
            return numero_c;
        }

        public void setNumero_c(int numero_c) {
            this.numero_c = numero_c;
        }

        public int getNumero_p() {
            return numero_p;
        }

        public void setNumero_p(int numero_p) {
            this.numero_p = numero_p;
        }
    }
