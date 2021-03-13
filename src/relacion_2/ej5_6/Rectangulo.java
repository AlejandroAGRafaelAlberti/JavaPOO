package relacion_2.ej5_6;

    public class Rectangulo{
        private int altura;
        private int base;
        private int perimetro;
        private int area;

        public int getAltura() {
            return altura;
        }

        public int getPerimetro() {
            return perimetro;
        }

        public int getArea() {
            return area;
        }

        @Override
        public String toString() {
            return "Rectangulo{" +
                    "altura=" + altura +
                    ", base=" + base +
                    ", perimetro=" + perimetro +
                    ", area=" + area +
                    '}';
        }

        public void setAltura(int altura) {
            if (!(altura==0)){
                this.altura = altura;
                if(altura<0){
                    this.altura = -altura;
                }
                this.perimetro = altura*2 + base*2;
                this.area = altura*base;
            }

        }

        public Rectangulo(int altura, int base) {
            this.altura = altura;
            this.base = base;
            this.perimetro = altura*2 + base*2;
            this.area = altura*base;
        }

        public int getBase() {
            return base;
        }

        public void setBase(int base) {
            if (!(base==0)){
                this.base = base;
                if(base<0){
                    this.base = -base;
                }
                this.perimetro = altura*2 + base*2;
                this.area = altura*base;
            }
        }
    }
