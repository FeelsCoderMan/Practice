

function ListNode(val, next) {
    this.val = (val===undefined ? 0 : val)
    this.next = (next===undefined ? null : next)
}




var isPalindrome = function(head) {
    var slow=head;
    var fast=head;
    while(fast!=null && fast.next!=null){
        slow=head.next;
        fast=head.next.next;
    }
    slow=reverseList(slow);
    fast=head;
    while(slow!=null){
        if(slow.val!=fast.val){
            return false;
        }
        slow=slow.next;
        fast=fast.val;
    }
    return true;
};
var reverseList=function(head){
    var prev=null;
    while(head!=null){
        var nextNode=head.next;
        head.next=prev;
        prev=head;
        head=nextNode;
    }
    return prev;
}