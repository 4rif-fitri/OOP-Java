package Lab_4_INHERITANCE;

class Cat extends Animal{
    
    public Cat(String name){
        super(name);
    }

    public void meow(){
        System.out.println(this.name + " is meowning");
    }

    

}
