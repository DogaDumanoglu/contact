import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class ReadingAndStoringInJavaGenerics {
    public static List<String> readFile(String path) {
        try {
            return Files.readAllLines(Paths.get(path));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    public static void storeInfosInCollections(String path) throws IOException {
        ArrayList<Contact> arrayList=new ArrayList<>();
        ArrayList<Contact> sortedArrayList=new ArrayList<>();
        HashSet<Contact> hashSet=new HashSet<>();
        TreeSet<Contact> treeSet=new TreeSet<>();
        TreeSet<Contact> treeSortedSet=new TreeSet<>(new LastNameComparator());
        HashMap<String,Contact> hashMap=new HashMap<>();
        List<String> lines = readFile(path);
        for(String line: Objects.requireNonNull(lines)){
            String[] contactsInfos=line.split(" ");
            Contact contact=new Contact(contactsInfos[0]/*phoneNumber*/,contactsInfos[1]/*firstName*/,contactsInfos[2]/*lastName*/,contactsInfos[3]/*socialSecurityNumber*/);
            arrayList.add(contact);
            sortedArrayList.add(contact);
            hashSet.add(contact);
            treeSet.add(contact);
            treeSortedSet.add(contact);
            hashMap.put(contactsInfos[0],contact);
        }
        WritingInJavaGenerics.writeArrayList(arrayList);
        WritingInJavaGenerics.writeSortedArrayList(sortedArrayList);
        WritingInJavaGenerics.writeHashSet(hashSet);
        WritingInJavaGenerics.writeTreeSet(treeSet);
        WritingInJavaGenerics.writeSortedTreeSet(treeSortedSet);
        WritingInJavaGenerics.writeHashMap(arrayList,hashMap);
    }

}
