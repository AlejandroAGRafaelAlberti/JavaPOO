package relacion_2.ej5_8;

    public class Tiempo{
        private int hora;
        private int minutos = 0;
        private int segundos = 0;

        public Tiempo(int hora, int minutos, int segundos) {
            this.hora = hora;
            this.minutos = minutos;
            this.segundos = segundos;
        }

        public Tiempo(int hora, int minutos) {
            this.hora = hora;
            this.minutos = minutos;
        }

        public Tiempo(int hora) {
            this.hora = hora;
        }


        @Override
        public String toString() {
            return
                    hora +"h "
                    + minutos + "m "
                    + segundos +"s "
                    ;
        }



        public int getHora() {
            return hora;
        }

        public void setHora(int hora) {
            this.hora = hora;
        }

        public int getMinutos() {
            return minutos;
        }

        public void setMinutos(int minutos) {
            this.minutos = minutos;
        }

        public int getSegundos() {
            return segundos;
        }

        public void setSegundos(int segundos) {
            this.segundos = segundos;
        }
    }
