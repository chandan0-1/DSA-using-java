class TrieNode{

    char data;
    boolean isTerminating;
    TrieNode children[];
    int childCount;

    public TrieNode(char data) {
        this.data = data;
        isTerminating = false;
        children = new TrieNode[26];
        childCount = 0;
    }
}


public class Trie {

    private TrieNode root;
    public int count;
    public Trie() {
        root = new TrieNode('\0');
    }


    private boolean s(TrieNode root, String word){
        if(word.length()==0 && root.isTerminating==true){
            return true;
        }
        else if(word.length()==0 && root.isTerminating==false) {
            return false;
        }
        
        int index = word.charAt(0) - 'a';
        TrieNode node = root.children[index];


        if (node==null){
            return false;
        }

        return s(node,word.substring(1));
    }



    public boolean search(String word){
        return s(root,word);
    }


    private void add(TrieNode root,String word){
        if (word.length() == 0){
            root.isTerminating = true;
            return;
        }

        int index = word.charAt(0) - 'a';
        TrieNode node = root.children[index];
        if (node==null){
            node = new TrieNode(word.charAt(0));
            root.children[index] = node;
            root.childCount++;
        }

        add(node,word.substring(1));

    }
    public void add(String word){
        add(root, word);
    }
}
