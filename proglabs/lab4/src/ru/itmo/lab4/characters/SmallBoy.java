package ru.itmo.lab4.characters;
import ru.itmo.lab4.enums.Adjectives;
import ru.itmo.lab4.exceptions.NameException;
import ru.itmo.lab4.exceptions.RelationshipException;
import ru.itmo.lab4.objects.Closet;
import ru.itmo.lab4.objects.Bump;
import ru.itmo.lab4.enums.Pronouns;
import ru.itmo.lab4.enums.Adverbs;

import java.util.Objects;

public class SmallBoy extends Person {

    public SmallBoy(String name) {
        super(name);
    }

    public void close(Person p, Closet c){
        System.out.print(this.getName() + " " + Adverbs.BARELY + " успел закрыть " + c.toString() + ",");
    }

    //lab4 local_class1 and checked_exception
    public void statusGunilla(Person p1, Person p2){

        class Like{
            private final String statusGunilla = "очень нравилась ";
            public Like(String status) throws RelationshipException {
                if (!status.equals(" не нравилась ")) throw new RelationshipException("Неправильный статус взаимоотношений");
            }
            @Override
            public String toString(){
                return statusGunilla;
            }
        }
        try {
            Like like = new Like (" не нравилась ");
            System.out.print(p1.getName() + "у" + " очень нравилась " + p2.getName() + ",");
        }
        catch (RelationshipException a){
            System.err.print(a.getMessage());
        }
    }

    //lab4 local_class2 and checked_exception
    public void statusChrister(Person p1, Person p2){
        class Love{
            private final String statusChrister = " любил ";
            public Love(String status) throws RelationshipException {
                if (!status.equals(" не любил ")) throw new RelationshipException("Неправильный статус взаимоотношений");
            }
            @Override
            public String toString(){
                return statusChrister;
            }
        }

        try {
            Love love = new Love (" не любил ");
            System.out.print(p2.getName() + "а" + " " + p1.getName() + " " +  Adverbs.TOO + " любил " );
        }
        catch (RelationshipException a){
            System.err.print(a.getMessage());
        }
    }

    public void tell(Person p){
        System.out.print(" и " + Pronouns.HE + " " + Adverbs.OFTEN + " рассказывал " + Adjectives.HIS + " " + p.getName() + ", ");
    }

    public void notHurt(Person p){
        System.out.print("Но вот " + p.getName() + " " + Pronouns.HE + " " + Adverbs.NEVER + " не бил.");
    }

    public void sorry(Bump b){
        System.out.print("и " + Adverbs.LONG_AGO + " простил " + Pronouns.HIM1 + " " + b.toString() + ".");
    }

}




