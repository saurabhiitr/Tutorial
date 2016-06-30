import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Data
{
	int data;

	public int getData() {
		return data;
	}

	public Data(int data) {
		super();
		this.data = data;
	}

	public void setData(int data) {
		this.data = data;
	}
}
public class ManualSort {
	public static void main(String[] args) {
		List<Data> list= new ArrayList<Data>();
		list.add(new Data(4));
		list.add(new Data(2));
		list.add(new Data(6));
		list.add(new Data(1));
		Collections.sort(list, new Comparator<Data>() {
			public int compare(Data o1,Data o2){
				return o2.data - o1.data;
			}
		});
		
		for(Data d:list){
			System.out.println(d.data);
		}
	}
}
