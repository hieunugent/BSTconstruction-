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
    public boolean contains(int value) {
      // Write your code here.
			if (this.value == value){
				return true;
			}
			else if (this.value > value ){
				if(left == null){return false;}
				return left.contains(value);
			}
			else{
				if (right == null){return false;}
				return right.contains(value);
			}
    }

    public BST remove(int value){
      remove(int value, null);
      return this;
    }
    public void remove(int value, BST parent){
      if(this.value > value){
        if(left != null){
          left.remove(value, this);
        }
      }else if (this.value < value){
        if(right != null){
          right.remove(value, this);
        }
      }
      else{
        if (right != null && left != null){
          this.value = right.getMinValue();
          right.remove(this.value, this);
        }
        else if (parent == null ){
          if (left != null){
            this.value = left.value;
            right = left.right;
            left = left.left;
          }
          else if(right != null){
            this.value = right.value;
            left = right.left;
            right = right.right;
          }else {

          }
        }
        else if (parent.left == this){
          parent.left = left != null ? left :right;

        }
        else if (parent.right == this){
          parent.right = left! = null ? left : right;
        }
      }
    }
    public int getMinValue(){
      if(left == null){
        return this.value;
      }else{
        return left.getMinValue();
      }
    }
  }

}
