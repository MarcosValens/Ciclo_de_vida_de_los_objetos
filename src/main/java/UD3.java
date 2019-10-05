public class UD3 {
    class Int {

        private int valor;

        public Int(int i) {
            valor = i;
        }

        public int getValor() {
            return valor;
        }

        public void setValor(int valor) {
            this.valor = valor;
        }

        public boolean equals(Object a) {
            if (!(a instanceof Int)) return false;

            return this.valor == ((Int) a).getValor();

        }
    }

    // NO CAMBIEU CAP LINIA DE L'ESTAT DE L'OBJECTE
    Object obj1 = new Object();
    Object obj2 = new Object();
    Object obj3 = new Object();
    Int int1 = new Int(1);
    Int int2 = new Int(2);


    public void exercici1() {
        //Fes que la variable obj1 no faci referència a cap objecte
        obj1 = null;

    }

    public void exercici2() {
        //Fes que la variable obj2 faci referencia al mateix objecte que la variable obj3
        obj2 = obj3;

    }

    public void exercici3() {
        //Fes que l'objecte referenciat per la variable obj2 sigui candidat per esser recolectat pel GC
        obj2 = null;
    }

    public void exercici4() {
        //Fes que les variables int1 i int2 apuntin a l'objecte que conte el valor enter de 1.
        int2 = int1;
    }

    public void exercici5() {
        //Fes que les variables int1 i int2 tenguin el mateix valor, però no apuntin al mateix objecte.
        int2.setValor(1);
    }
}
