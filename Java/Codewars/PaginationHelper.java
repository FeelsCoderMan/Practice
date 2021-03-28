import java.util.List;

// TODO: complete this object/class

public class PaginationHelper<I> {
    private int collectionLength=0;
    private int itemsPerPage=0;

    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.collectionLength=collection.size();
        this.itemsPerPage=itemsPerPage;
    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        return collectionLength;

    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        return (int) Math.ceil((double)this.collectionLength/this.itemsPerPage);

    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {
        int numberOfPages=pageCount();
        if(pageIndex>=numberOfPages || pageIndex<0){
            return -1;
        }
        if(pageIndex==numberOfPages-1){
            return collectionLength%this.itemsPerPage;
        }else{
            return itemsPerPage;
        }
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
        if(itemIndex<0 ||itemIndex>=collectionLength){
            return -1;
        }else{
            return (itemIndex-1)/itemsPerPage;
        }
    }
}