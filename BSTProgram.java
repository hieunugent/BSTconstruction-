class BSTProgram{
  static class BST{
    public int value;
    public BST left;
    public BST right;

    public BST(int value){
      this.value = value;
    }
    public BST insert(int value){
      if (this.value > value){
        if (left == null){
          BST newNode = new BST(value);
          left = newNode;
        }
        else{
          left.insert(value);
        }
      }
      else{
        if (right == null){
          BST newNode = new BST(value);
          right = newNode;
        }
        else{
          right.insert(value);
        }
      }
    }

  }

}
