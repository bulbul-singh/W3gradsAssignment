<h2><a href="https://www.geeksforgeeks.org/problems/make-coprime-array3058/1">Make Co-prime Array</a></h2><h3>Difficulty Level : Basic</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given an array of N elements, find the minimum number of insertions to convert the given array into a co-prime array adjacent pair-wise.&nbsp;</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>A[] = {2, 7, 28}
<strong>Output: </strong>1<strong>
Explanation: </strong>Here, 1st pair = {2, 7}
are co-primes( gcd(2, 7) = 1). 2nd pair
= {7, 28} are not co-primes, insert 9
between them. gcd(7, 9) = 1 and
gcd(9, 28) = 1.</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong> A[] = {5, 10, 20}
<strong>Output : </strong>2<strong>
Explanation: </strong>Here, there is no pair
which are co-primes. Insert 7 between
(5, 10) and 1 between (10, 20).</span></pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
The input is already taken care of by the driver code. You only need to complete the function <strong>countCoPrime()</strong> that takes an array <strong>(arr)</strong>, sizeOfArray <strong>(n)</strong>, and return the minimum number of insertions. The driver code takes care of the printing.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(N).<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(1).</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1&lt;=N&lt;=10<sup>5</sup><br>
1&lt;=arr&lt;=10<sup>5</sup></span><br>
&nbsp;</p>
</div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>Data Structures</code>&nbsp;