/*
 * @lc app=leetcode id=901 lang=java
 *
 * [901] Online Stock Span
 * 
 * //单调栈(monotonic stack)
 * //用两个栈， prices, spans
 */

// @lc code=start
class StockSpanner {

    private Stack<Integer> prices;
    private Stack<Integer> spans;

    public StockSpanner() {
        prices = new Stack<>();
        spans = new Stack<>();
        
    }
    
    public int next(int price) {
        int span = 1;
        while (!prices.empty() && price >= prices.peek()) {
            span += spans.pop();
            prices.pop();
        }

        prices.push(price);
        spans.push(span);

        return span;

        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
// @lc code=end

