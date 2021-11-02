package hashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class OrderedMap {

	public static void main(String[] args) {
		// HashSet(순서없음), LinkedHashSet(순서있음), TreeSet(정렬됨)
		// HashMap(순서없음), LinkedHashMap(순서있음), TreeMap(정렬됨)

		Map<Integer, String> months1 = new LinkedHashMap<>();
		
		months1.put(1, "1월");
		months1.put(3, "3월");
		months1.put(6, "6월");
		// 링크드 해시맵은 입력순으로 출력됨
		months1.forEach((k, v) -> System.out.println(k + ": " + v));
		
		System.out.println();
		
		Map<Integer, String> months2 = new TreeMap<>();
		
		months2.put(3, "3월");
		months2.put(6, "6월");
		months2.put(1, "1월");
		// 트리맵은 정렬됨(키 값으로 정렬)
		months2.forEach((k, v) -> System.out.println(k + ": " + v));
	}

}
