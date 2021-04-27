import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class WritingInJavaGenerics {
    public static void writeArrayList(ArrayList<Contact> arrayList) throws IOException {
        FileWriter fw=new FileWriter("contactsArrayList.txt");
        for (Contact contact : arrayList) {
            fw.write(contact.getPhoneNumber()
                    + " " + contact.getFirstName() + " " + contact.getLastName()
                    + " " + contact.getSocialSecurityNumber()+"\n");}
        fw.close();
    }
    public static void writeSortedArrayList(ArrayList<Contact> sortedArrayList) throws IOException {
        Collections.sort(sortedArrayList,new LastNameComparator());
        FileWriter fw=new FileWriter("contactsArrayListOrderByLastName.txt");
        for (Contact contact : sortedArrayList) {
            fw.write(contact.getPhoneNumber()
                    + " " + contact.getFirstName() + " " + contact.getLastName()
                    + " " + contact.getSocialSecurityNumber()+"\n");}
        fw.close();
    }
    public static void writeHashSet(HashSet<Contact> hashSet) throws IOException {
        FileWriter fw=new FileWriter("contactsHashSet.txt");
        for (Contact contact1 : hashSet) {
            fw.write(contact1.getPhoneNumber() + " " + contact1.getFirstName() + " "
                    + contact1.getLastName() + " " +contact1.getSocialSecurityNumber() + "\n");
        }
        fw.close();
    }
    public static void writeTreeSet(TreeSet<Contact> treeSet) throws IOException {
        FileWriter fw=new FileWriter("contactsTreeSet.txt");
        for (Contact contact2 : treeSet) {
            fw.write(contact2.getPhoneNumber() + " " + contact2.getFirstName() + " "
                    + contact2.getLastName() + " " + contact2.getSocialSecurityNumber() + "\n");
        }
        fw.close();
    }
    public static void writeSortedTreeSet(TreeSet<Contact> treeSortedSet) throws IOException {
        FileWriter fw=new FileWriter("contactsTreeSetOrderByLastName.txt");
        for (Contact contact2 : treeSortedSet) {
            fw.write(contact2.getPhoneNumber() + " " + contact2.getFirstName() + " "
                    + contact2.getLastName() + " " + contact2.getSocialSecurityNumber() + "\n");
        }
        fw.close();
    }
    public static void writeHashMap(ArrayList<Contact> arrayList,HashMap<String,Contact> hashMap) throws IOException {
        FileWriter fw=new FileWriter("contactsHashMap.txt");
        for (int i =0;i<hashMap.size();i++) {
            fw.write(hashMap.get(arrayList.get(i).getPhoneNumber()).getPhoneNumber() + " " + hashMap.get(arrayList.get(i).getPhoneNumber()).getFirstName() + " "
                    + hashMap.get(arrayList.get(i).getPhoneNumber()).getLastName() + " " + hashMap.get(arrayList.get(i).getPhoneNumber()).getSocialSecurityNumber() + "\n");
        }
        fw.close();
    }

}

