import org.junit.Test;
import static org.junit.Assert.assertTrue;
// this test case is use from AlgoExpert.io
public class TestCase{
  static BSTProgram.BST test1;
  static BSTProgram.BST test2;
  static BSTProgram.BST test3;
  static BSTProgram.BST test4;
  static {
    test1 = new BSTProgram.BST(10);
    test1.insert(5).insert(15).insert(5).insert(2).insert(14).insert(22);
    test2 = new BSTProgram.BST(10);
    test2.insert(15).insert(11).insert(22).remove(10);
    test3 = new Program.BST(10);
    test3.insert(5).insert(7).insert(2).remove(10);
    test4 = new Program.BST(10);
    test4.insert(5)
        .insert(15)
        .insert(22)
        .insert(17)
        .insert(34)
        .insert(7)
        .insert(2)
        .insert(5)
        .insert(1)
        .insert(35)
        .insert(27)
        .insert(16)
        .insert(30)
        .remove(22)
        .remove(17);

  }
  private void inOrderTraverse(BSTProgram.BST tree, List<Integer> array){
    if(tree.left != null){
      this.inOrderTraverse(tree.left, array);
    }
    array.add(tree.value);
    if(tree.right != null){
      this.inOrderTraverse(tree.right, array);
    }
  }
  private boolean compare(List<Integer> arr1, List<Integer> arr2){
    if (arr1.size() != arr2.size()){
      return false;
    }
    for (int i = 0 ; i < arr1.size(); i++){
      if(!arr1.get(i).equals(arr2.get(i))){
        return false;
      }
    }
    return true;
  }


  @Test
  public void TestCase1(){
    assertTrue(this.test1.left.value == 5);
  }
  @Test
  public void TestCase2(){
    assertTrue(this.test1.right.right.value == 22);
  }
  @Test
  public void TestCase3(){
    assertTrue(this.test1.right.left.value == 14);
  }
  @Test
  public void Testcase4(){
    assertTrue(this.test1.left.right.value == 5);
  }
  @Test
  public void TestCase5() {
    assertTrue(this.test1.left.left.value == 2);
  }

  @Test
  public void TestCase6() {
    assertTrue(this.test1.left.left.left == null);
  }

  @Test
  public void TestCase7() {
    assertTrue(this.test1.right.right.right == null);
  }

  @Test
  public void TestCase8() {
    assertTrue(this.test1.contains(15) == true);
  }

  @Test
  public void TestCase9() {
    assertTrue(this.test1.contains(2) == true);
  }

  @Test
  public void TestCase10() {
    assertTrue(this.test1.contains(5) == true);
  }

  @Test
  public void TestCase11() {
    assertTrue(this.test1.contains(10) == true);
  }

  @Test
  public void TestCase12() {
    assertTrue(this.test1.contains(22) == true);
  }

  @Test
  public void TestCase13() {
    assertTrue(this.test1.contains(23) == false);
  }

  @Test
  public void TestCase14() {
    List<Integer> expected = new ArrayList<Integer>(Arrays.asList(11, 15, 22));
    List<Integer> output = new ArrayList<Integer>();
    this.inOrderTraverse(this.test2, output);
    assertTrue(this.compare(output, expected));
  }

  @Test
  public void TestCase15() {
    List<Integer> expected = new ArrayList<Integer>(Arrays.asList(2, 5, 7));
    List<Integer> output = new ArrayList<Integer>();
    this.inOrderTraverse(this.test3, output);
    assertTrue(this.compare(output, expected));
  }

  @Test
  public void TestCase16() {
    List<Integer> expected =
        new ArrayList<Integer>(Arrays.asList(1, 2, 5, 5, 7, 10, 15, 16, 27, 30, 34, 35));
    List<Integer> output = new ArrayList<Integer>();
    this.inOrderTraverse(this.test4, output);
    assertTrue(this.compare(output, expected));
  }

  @Test
  public void TestCase17() {
    assertTrue(this.test4.right.right.value == 27);
  }

  @Test
  public void TestCase18() {
   assertTrue(this.test4.right.right.left.value == 16);
  }

}
