package OO1.ejercicio16_FilteredSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
public class evenNumberSet implements Set<Integer> {
	private List<Integer> pares;
	
	public evenNumberSet() {
		this.pares=new ArrayList();
	}
	
	private boolean isEven(Integer number){
		return number!=null && number%2==0;
	}
	
	private boolean containsEven(Integer number) {
		for(Integer num:pares) {
			if(num.equals(number)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean add(Integer number) {
		if(!isEven(number)) {
			 throw new IllegalArgumentException("Solo se permiten números pares");
		}
		if(containsEven(number)) {
			return false;
		}
		pares.add(number);
		return true;
	}
	
	public int size() {
		return pares.size();
	}
	
	public boolean isEmpty() {
		return pares.isEmpty();
	}
	
	public boolean contains(Object o) {
		if(o instanceof Integer) {
			Integer number=(Integer)o;
			return containsEven(number);
		}
		return false;
	}
	
	public boolean remove(Object o) {
		if(o instanceof Integer) {
			return pares.remove(o);
		}
		return false;
	}
	
	public boolean containsAll(Collection<?>c) {
		for(Object o:c) {
			if(!contains(o)) {
				return false;
			}
		}
		return true;
	}
	
	public boolean addAll(Collection<? extends Integer>c) {
		boolean modified=false;
		for(Integer number:c) {
			if(isEven(number) && !containsEven(number)) {
				pares.add(number);
				modified=true;
			}else if(!isEven(number)) {
				throw new IllegalArgumentException("La colección contiene un número impar: " + number);
			}
		}
		return modified;
	}
	
	public boolean removeAll(Collection<?>c) {
		boolean modified=false;
		for(Object o:c) {
			if(o instanceof Integer && pares.remove(o)) {
				modified=true;
			}
		}
		return modified;
	}
	
	public boolean retainAll(Collection<?> c) {
        boolean modified = false;
        Iterator<Integer> it = pares.iterator();
        while (it.hasNext()) {
            Integer number = it.next();
            if (!c.contains(number)) {
                it.remove();
                modified = true;
            }
        }
        return modified;
    }
	
	public void clear() {
		pares.clear();
	}
	
	public Iterator<Integer> iterator() {
        return pares.iterator();
    }

    public Object[] toArray() {
        return pares.toArray();
    }

    
    public <T> T[] toArray(T[] a) {
        return pares.toArray(a);
    }

}
