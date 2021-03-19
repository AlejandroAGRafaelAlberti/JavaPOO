package relacion_2.ej5_6;

    public class Rectangulo{
        private int altura;
        private int base;

        public int getAltura() {
            return altura;
        }
        public int getBase() {
            return base;
        }

        public int getPerimetro() {
            return altura*2 + base*2;
        }

        public int getArea() {
            return altura*base;
        }

        @Override
        public String toString() {
            return "Rectangulo{" +
                    "altura=" + altura +
                    ", base=" + base +
                    '}';
        }

        public void setAltura(int altura){
            this.altura = altura;
            if(altura<0){
                this.altura = -altura;
            }
        }
        public Rectangulo(int altura, int base) {
            this.altura = altura;
            this.base = base;
        }

        public void setBase(int base) {
            this.base = base;
            if(base<0){
                this.base = -base;
            }
        }
    }
