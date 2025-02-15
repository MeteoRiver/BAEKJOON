# [Silver V] Insulator - 8016 

[문제 링크](https://www.acmicpc.net/problem/8016) 

### 성능 요약

메모리: 27104 KB, 시간: 296 ms

### 분류

그리디 알고리즘, 수학, 정렬

### 제출 일자

2025년 2월 15일 20:19:08

### 문제 설명

<p>The company Insumax produces multilayer thermal insulators. Each of the i layers, i=1,2,…,n, of such an insulator is characterized by positive insulation coefficient a<sub>i</sub>. The layers are numbered according to the direction the heat leaks.</p>

<p>    heat → ||a<sub>1</sub>|a<sub>2</sub>|…|a<sub>i</sub>|a<sub>i+1</sub>|…|a<sub>n</sub>|| →</p>

<p>The insulation coefficient of the whole insulator, A, is described by the sum of insulation coefficients of its layers. Moreover, the coefficient A raises if a layer with a smaller insulation coefficient is followed by a layer with a larger coefficient, according to the formula:</p>

<p><mjx-container class="MathJax" jax="CHTML" style="font-size: 109%; position: relative;"> <mjx-math class="MJX-TEX" aria-hidden="true"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D434 TEX-I"></mjx-c></mjx-mi><mjx-mo class="mjx-n" space="4"><mjx-c class="mjx-c3D"></mjx-c></mjx-mo><mjx-munderover space="4" limits="false"><mjx-mo class="mjx-sop"><mjx-c class="mjx-c2211 TEX-S1"></mjx-c></mjx-mo><mjx-script style="vertical-align: -0.285em; margin-left: 0px;"><mjx-texatom size="s" texclass="ORD"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D45B TEX-I"></mjx-c></mjx-mi></mjx-texatom><mjx-spacer style="margin-top: 0.284em;"></mjx-spacer><mjx-texatom size="s" texclass="ORD"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D456 TEX-I"></mjx-c></mjx-mi><mjx-mo class="mjx-n"><mjx-c class="mjx-c3D"></mjx-c></mjx-mo><mjx-mn class="mjx-n"><mjx-c class="mjx-c31"></mjx-c></mjx-mn></mjx-texatom></mjx-script></mjx-munderover><mjx-texatom space="2" texclass="ORD"><mjx-msub><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D44E TEX-I"></mjx-c></mjx-mi><mjx-script style="vertical-align: -0.15em;"><mjx-mi class="mjx-i" size="s"><mjx-c class="mjx-c1D456 TEX-I"></mjx-c></mjx-mi></mjx-script></mjx-msub></mjx-texatom><mjx-mo class="mjx-n" space="3"><mjx-c class="mjx-c2B"></mjx-c></mjx-mo><mjx-munderover space="3" limits="false"><mjx-mo class="mjx-sop"><mjx-c class="mjx-c2211 TEX-S1"></mjx-c></mjx-mo><mjx-script style="vertical-align: -0.285em; margin-left: 0px;"><mjx-texatom size="s" texclass="ORD"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D45B TEX-I"></mjx-c></mjx-mi><mjx-mo class="mjx-n"><mjx-c class="mjx-c2212"></mjx-c></mjx-mo><mjx-mn class="mjx-n"><mjx-c class="mjx-c31"></mjx-c></mjx-mn></mjx-texatom><mjx-spacer style="margin-top: 0.233em;"></mjx-spacer><mjx-texatom size="s" texclass="ORD"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D456 TEX-I"></mjx-c></mjx-mi><mjx-mo class="mjx-n"><mjx-c class="mjx-c3D"></mjx-c></mjx-mo><mjx-mn class="mjx-n"><mjx-c class="mjx-c31"></mjx-c></mjx-mn></mjx-texatom></mjx-script></mjx-munderover><mjx-texatom space="2" texclass="ORD"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D45A TEX-I"></mjx-c></mjx-mi><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D44E TEX-I"></mjx-c></mjx-mi><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D465 TEX-I"></mjx-c></mjx-mi><mjx-mo class="mjx-n"><mjx-c class="mjx-c28"></mjx-c></mjx-mo><mjx-mn class="mjx-n"><mjx-c class="mjx-c30"></mjx-c></mjx-mn><mjx-mo class="mjx-n"><mjx-c class="mjx-c2C"></mjx-c></mjx-mo><mjx-msub space="2"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D44E TEX-I"></mjx-c></mjx-mi><mjx-script style="vertical-align: -0.15em;"><mjx-texatom size="s" texclass="ORD"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D456 TEX-I"></mjx-c></mjx-mi><mjx-mo class="mjx-n"><mjx-c class="mjx-c2B"></mjx-c></mjx-mo><mjx-mn class="mjx-n"><mjx-c class="mjx-c31"></mjx-c></mjx-mn></mjx-texatom></mjx-script></mjx-msub><mjx-mo class="mjx-n" space="3"><mjx-c class="mjx-c2212"></mjx-c></mjx-mo><mjx-msub space="3"><mjx-mi class="mjx-i"><mjx-c class="mjx-c1D44E TEX-I"></mjx-c></mjx-mi><mjx-script style="vertical-align: -0.15em;"><mjx-mi class="mjx-i" size="s"><mjx-c class="mjx-c1D456 TEX-I"></mjx-c></mjx-mi></mjx-script></mjx-msub><mjx-mo class="mjx-n"><mjx-c class="mjx-c29"></mjx-c></mjx-mo></mjx-texatom></mjx-math><mjx-assistive-mml unselectable="on" display="inline"><math xmlns="http://www.w3.org/1998/Math/MathML"><mi>A</mi><mo>=</mo><munderover><mo data-mjx-texclass="OP">∑</mo><mrow data-mjx-texclass="ORD"><mi>i</mi><mo>=</mo><mn>1</mn></mrow><mrow data-mjx-texclass="ORD"><mi>n</mi></mrow></munderover><mrow data-mjx-texclass="ORD"><msub><mi>a</mi><mi>i</mi></msub></mrow><mo>+</mo><munderover><mo data-mjx-texclass="OP">∑</mo><mrow data-mjx-texclass="ORD"><mi>i</mi><mo>=</mo><mn>1</mn></mrow><mrow data-mjx-texclass="ORD"><mi>n</mi><mo>−</mo><mn>1</mn></mrow></munderover><mrow data-mjx-texclass="ORD"><mi>m</mi><mi>a</mi><mi>x</mi><mo stretchy="false">(</mo><mn>0</mn><mo>,</mo><msub><mi>a</mi><mrow data-mjx-texclass="ORD"><mi>i</mi><mo>+</mo><mn>1</mn></mrow></msub><mo>−</mo><msub><mi>a</mi><mi>i</mi></msub><mo stretchy="false">)</mo></mrow></math></mjx-assistive-mml><span aria-hidden="true" class="no-mathjax mjx-copytext">\( A= \sum_{i=1}^{n} {a_i} + \sum_{i=1}^{n-1} {max(0, a_{i+1}-a_i)} \)</span></mjx-container>.</p>

<p>For example, the insulation coefficient of the insulator of the form</p>

<p>    → ||5|4|1|7|| →</p>

<p>is A=(5+4+1+7)+(7-1)=23.</p>

<p>
Write a program which, for given insulation coefficients of layers a<sub>1</sub>,a<sub>2</sub>,…,a<sub>n</sub>, determines such an ordering of the layers that the insulation coefficient of the whole insulator is maximised.</p>

### 입력 

 <p>In the first line of the standard input there is the number of layers n, 1 ≤ n ≤ 100,000. In the successive n lines there are coefficients a<sub>1</sub>,a<sub>2</sub>,…,a<sub>n</sub>, one per line. Those coefficients are integers satisfying the inequalities 1 ≤ a<sub>i</sub> ≤ 10,000.</p>

### 출력 

 <p>In the first and only line of the standard output your program should write one integer equal to the largest possible value of the insulation coefficient A of the insulator built of the layers of the given coefficients, put in a particular order.</p>

