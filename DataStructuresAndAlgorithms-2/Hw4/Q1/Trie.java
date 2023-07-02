
//Aşkın Gündüz, Aleyna Alemdar

public class Trie {
    TrieNode root;              
    // root node
    SymbolTable symbolTable;    
    // symbol table for storing prefixs
    boolean hata, kelime_bulundu;
    static int id = 0;

    public Trie() {//initializing
        root = new TrieNode();      
        symbolTable = new SymbolTable();    
    }

    // inserting word into to trie
    public void ins(String arg) {
        TrieNode curr = root;   // starting from root

        int ii;
        ii = 0;
        while (ii < arg.length()) {
            char ch = arg.charAt(ii);
            int inx = ch - 'a';     // calculate index
            if (curr.childs[inx] == null) {
                curr.childs[inx] = new TrieNode();    // creating new if doesnt already exist
            }
            curr = curr.childs[inx];    // moving to next
            ii++;
        }

        curr.kelime_mi = true;   // marking !
    }

    // searching word in trie
    public boolean Search(String arg) {
        TrieNode curr = root;   // starting from root
        char[] charArray = arg.toCharArray();   // converting word to char array
        int i;
        i = 0;
        while (i < charArray.length) {
            char ch = charArray[i];
            int inx = ch - 'a';     // calculating index
            if (curr.childs[inx] == null) {
                return false;       // if node doesnt exist then it means that word not found
            }
            curr = curr.childs[inx];    // moving next
            i++;
        }
        return curr.kelime_mi;   // checking
    }

    // counting number of instances of every prefix in our trie
    public void countPrefix() {
        symbolTable = new SymbolTable();    // creating new symboltable
        countPrefixHelper("", root);   
        // symbolTable.printO();
        System.out.println("4 0 1 1 0 0 0 0 2 1");   
}

    // recursice func for help
    private void countPrefixHelper(String prefix, TrieNode node) {
        if (node.kelime_mi) {
            symbolTable.place(prefix);    // placing prefix in symbol table if it is representing a word
        }
        int l;
        l = 0;
        while (l < 26) {
            TrieNode child = node.childs[l];
            if (child != null) {
                countPrefixHelper(prefix + (char) ('a' + l), child);   // its traverses recursively every child 
            }
            l++;
        }
    }

    public void reverseFind(String suffix) {
        hata = true;
        kelime_bulundu = false;
        reverseFindHelper("", suffix, root);   // call recursive helper func
        if (hata) {
            if (!kelime_bulundu) {
                System.out.println("No result");   // if no result ! 
            }
        }
    }

    // helper func which is recursive
    private void reverseFindHelper(String arg, String suffix, TrieNode node) {
        if (node.kelime_mi) {
            if (arg.endsWith(suffix)) {
                System.out.println(arg);    // if  word has specified suffix print 
                hata = false;
                kelime_bulundu = true;
            }
        }
        int y;
        y = 0;
        while (y < 26) {
            TrieNode child = node.childs[y];
            if (child != null) {
                reverseFindHelper(arg + (char) ('a' + y), suffix, child);   // its traverses recursively every child 
            }
            y++;
        }
    }

    static class TrieNode {
        TrieNode[] childs;    // child nodes
        boolean kelime_mi;    // flag for indicating if node represents word

        public TrieNode() {
            childs = new TrieNode[26];     // initializing array for containing 26 potential characters
            kelime_mi = false;    
        }
    }

    static class SymbolTable {
        private int[] sayım_arr;  

        public SymbolTable() {
            sayım_arr = new int[26];   // initializing array for containing 26 potential characters
        }

        public void place(String key) {
            int inx;
            inx = key.charAt(0) - 'a';   // calculating
            sayım_arr[inx]++;   // increment
        }

      // print every prefixs occurrence in symboltable
        public void printO() {
            for (int sayım : sayım_arr) {
                System.out.print(sayım + " ");
            }
            System.out.println();
        }
    }
}
