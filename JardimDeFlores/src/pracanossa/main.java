package pracanossa;

public class main {
    
    public static void main(String[] args) {
        
        Petala petala1 = new Petala();
        petala1.setCorPetala("Roxo");
        
        Petala petala2 = new Petala();
        petala2.setCorPetala("Vermelho");
        
        Petala petala3 = new Petala();
        petala3.setCorPetala("Preta");
        
        Petala petala4 = new Petala();
        petala4.setCorPetala("Prata");
        
        Petala petala5 = new Petala();
        petala5.setCorPetala("Marrom");
        
        Petala petala6 = new Petala();
        petala6.setCorPetala("Verde");
        
        Petala petala7 = new Petala();
        petala7.setCorPetala("Azul");
        
        Petala petala8 = new Petala();
        petala8.setCorPetala("Turquesa");
        
        Flores flor1 = new Flores();
        flor1.setPetala1(petala4);
        flor1.setPetala2(petala7);
        
        Flores flor2 = new Flores();
        flor2.setPetala1(petala1);
        flor2.setPetala2(petala2);
        
        Flores flor3 = new Flores();
        flor3.setPetala1(petala3);
        flor3.setPetala2(petala8);
        
        Flores flor4 = new Flores();
        flor4.setPetala1(petala5);
        flor4.setPetala2(petala6);
        
        Jardim jardim1 = new Jardim();
        jardim1.setFlor1(flor2);
        jardim1.setFlor2(flor3);
        
        Jardim jardim2 = new Jardim();
        jardim2.setFlor1(flor1);
        jardim2.setFlor2(flor4);
        
        Pracinha praca = new Pracinha();
        praca.setJardim1(jardim2);
        praca.setJardim2(jardim1);
        
        System.out.println("Na Praça Nossa temos no...\n");
        
        System.out.println("Jardim 1:\n");
        System.out.println("\tFlores com pétalas: ");
        System.out.println("\t\tFlor 1:");
        System.out.println("\t\t" + praca.getJardim1().getFlor1().getPetala1().getCorPetala());
        System.out.println("\t\t e ");
        System.out.println("\t\t" + praca.getJardim1().getFlor1().getPetala2().getCorPetala());
        System.out.println("\t\tFlor 2:");
        System.out.println("\t\t" + praca.getJardim1().getFlor2().getPetala1().getCorPetala());
        System.out.println("\t\t e ");
        System.out.println("\t\t" + praca.getJardim1().getFlor2().getPetala2().getCorPetala());
        
        System.out.println("Jardim 2:\n");
        System.out.println("\tFlores com pétalas: ");
        System.out.println("\n\t\tFlor 1:");
        System.out.println("\t\t" + praca.getJardim2().getFlor1().getPetala1().getCorPetala());
        System.out.println("\t\t e ");
        System.out.println("\t\t" + praca.getJardim2().getFlor1().getPetala2().getCorPetala());
        System.out.println("\n\t\tFlor 2:");
        System.out.println("\t\t" + praca.getJardim2().getFlor2().getPetala1().getCorPetala());
        System.out.println("\t\t e ");
        System.out.println("\t\t" + praca.getJardim2().getFlor2().getPetala2().getCorPetala());
        
        System.out.println("No Jardim 1 temmos...\n");
        
        System.out.println("Flor 1:\n");
        System.out.println("\tCom pétalas: ");
        System.out.println("\t\tPetala 1:");
        System.out.println("\t\t" + jardim1.getFlor1().getPetala1().getCorPetala());
        System.out.println("\t\tPetala 2:");
        System.out.println("\t\t" + jardim1.getFlor1().getPetala2().getCorPetala());
        
        System.out.println("Flor 2:\n");
        System.out.println("\tCom pétalas: ");
        System.out.println("\t\tPetala 1:");
        System.out.println("\t\t" + jardim1.getFlor2().getPetala1().getCorPetala());
        System.out.println("\t\tPetala 2:");
        System.out.println("\t\t" + jardim1.getFlor2().getPetala2().getCorPetala());
        
        System.out.println("No Jardim 2 temmos...\n");
        
        System.out.println("Flor 1:\n");
        System.out.println("\tCom pétalas: ");
        System.out.println("\t\tPetala 1:");
        System.out.println("\t\t" + jardim2.getFlor1().getPetala1().getCorPetala());
        System.out.println("\t\tPetala 2:");
        System.out.println("\t\t" + jardim2.getFlor1().getPetala2().getCorPetala());
        
        System.out.println("Flor 2:\n");
        System.out.println("\tCom pétalas: ");
        System.out.println("\t\tPetala 1:");
        System.out.println("\t\t" + jardim2.getFlor2().getPetala1().getCorPetala());
        System.out.println("\t\tPetala 2:");
        System.out.println("\t\t" + jardim2.getFlor2().getPetala2().getCorPetala());
        
        System.out.print("\nA Flor 1 tem pétalas ");
        System.out.print(flor1.getPetala1().getCorPetala());
        System.out.print(" e ");
        System.out.print(flor1.getPetala2().getCorPetala() + "\n");
        
        System.out.print("\nA Flor 2 tem pétalas ");
        System.out.print(flor2.getPetala1().getCorPetala());
        System.out.print(" e ");
        System.out.print(flor2.getPetala2().getCorPetala() + "\n");
        
        System.out.print("\nA Flor 3 tem pétalas ");
        System.out.print(flor3.getPetala1().getCorPetala());
        System.out.print(" e ");
        System.out.print(flor3.getPetala2().getCorPetala() + "\n");
        
        System.out.print("\nA Flor 4 tem pétalas ");
        System.out.print(flor4.getPetala1().getCorPetala());
        System.out.print(" e ");
        System.out.print(flor4.getPetala2().getCorPetala() + "\n");
        
    }
    
}
