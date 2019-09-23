import com.sun.xml.internal.ws.api.pipe.Tube;

import java.util.LinkedList;
import java.util.List;

/**
 * @Auther: VirtualChen601
 * @Date: 2019/9/23 14:17
 * @Description:实现一个 Trie (前缀树)，包含 insert, search, 和 startsWith 这三个操作。
 */
class Trie {
    //根节点
    private TrieNode root;

    /** Initialize your data structure here. */
    public Trie() {
        //初始化根节点
        root = new TrieNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode node = this.root;
        //遍历
        for(char c: word.toCharArray()){
            if(node.children[c-'a']==null){
                node.children[c-'a']=new TrieNode();
            }
            node = node.children[c-'a'];
        }
        node.item = word;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode node = this.root;
        //遍历
        for(char c:word.toCharArray()){
            if(node.children[c-'a']==null){
                return false;
            }
            node = node.children[c-'a'];
        }
        return node.item.equals(word);
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode node = this.root;
        //遍历
        for(char c: prefix.toCharArray()){
            if(node.children[c-'a']==null){
                return false;
            }
            node = node.children[c-'a'];
        }
        return true;

    }
    //定义 前缀树节点 的结构
    class TrieNode{
        //孩子节点，分别记录26个字母
        TrieNode[] children = new TrieNode[26];
        //当前的节点（叶子节点）对应的单词
        String item = "";
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */


