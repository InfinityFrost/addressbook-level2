package seedu.addressbook.data.person;

public class Contact {
    
    protected boolean isPrivate;
	protected String value;
    
    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }


    public boolean isPrivate() {
        return isPrivate;
    }
}
