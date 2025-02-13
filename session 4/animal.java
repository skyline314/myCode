abstract class animal {
    public abstract void animalSound();

    public void sleep(){
        System.out.println("TURU");
    }
}


class cat extends animal{

    @Override
    public void animalSound() {
        throw new UnsupportedOperationException("Miiao");
    }
    
}

