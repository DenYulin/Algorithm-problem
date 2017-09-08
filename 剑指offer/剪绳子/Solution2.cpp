int maxProductAfterCutting_solution2(int length) 
{
	if (length < 2)
		return 0;
	if (length == 2)
		return 1;
	if (length == 3)
		return 2;

	// 尽可能多地区剪去长度为3的绳子段
	int timesOf3 = length / 3;

	// 当绳子最后剩下的长度为4的时候，不能再减去长度为3的绳子段。
	// 此时更好的方法是把绳子剪去长度为2的两段，因为 2 × 2 > 3 × 1
	
	if (length - timesOf3 * 3 == 1) {
		timesOf3 -= 1;
	}
	int timesOf2 = (length - timesOf3 * 3) / 2;

	return (int) (pow(3, timesOf3)) * (int)(pow(2, timesOf2));
}