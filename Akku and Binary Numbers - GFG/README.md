# Akku and Binary Numbers
## Easy 
<div class="problem-statement">
                <p></p><p><span style="font-size:18px">Akku likes binary numbers and she likes playing with these numbers. Her teacher once gave her a question.For given value of&nbsp; L and&nbsp;R, Akku have to find the count of number X, which have only three-set bits in it's binary representation such that "L ≤ X ≤ R".Akku is genius, she solved the problem easily. Can you do it ??</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input</strong>:
L = 11 and R = 19 
<strong>Output:</strong>&nbsp;4
<strong>Explanation</strong>:
There are 4 such numbers with 3 set bits in 
range 11 to 19.
11 -&gt; 1011
13 -&gt; 1101
14 -&gt; 1110
19 -&gt; 10011</span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
L = 14 and R = 19
<strong>Output: </strong>2
</span></pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:&nbsp;&nbsp;</strong><br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>solve()</strong>&nbsp;which takes the integer <strong>L</strong> and <strong>R</strong> as input parameters and returns&nbsp;the count of number X, which have only three-set bits in its binary representation such that "L ≤ X ≤ R".<br>
<br>
<strong>Expected Time Complexity:</strong> O(log(63<sup>3</sup>))<br>
<strong>Expected Auxiliary Space:</strong> O(1)</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong></span><br>
<span style="font-size:18px">1 ≤ L ≤ R ≤ 10<sup>18</sup></span></p>
 <p></p>
            </div>