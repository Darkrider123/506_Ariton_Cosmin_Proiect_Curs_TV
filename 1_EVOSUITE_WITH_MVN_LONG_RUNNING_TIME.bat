echo "Compile to byte-code for EvoSuite"
call mvn compile

echo "Generating tests with default EvoSuite settings, but with parallel execution"
echo ""
echo "EvoSuite tries to maximize code coverage by using a combination of:"
echo "--> Branch coverage"
echo "--> Line coverage"
echo "--> Mutation testing"
echo ""
echo "And EvoSuite tries to minimize the number of tests"
call mvn -Dcores=12 -DmemoryInMB=10000 -Dmutation_probability=0.8 -Dpopulation_size=1000000000000000000 evosuite:generate
::-Dcriterion=branch - DmaxStatementCoverage=0.9 -Dsearch_budget=1000

echo ""
echo "We can see info about the tests EvoSuite created like number of classes tested and overall coverage"
call mvn evosuite:info

echo ""
echo "We can export the generated tests"
call mvn evosuite:export

echo "Having the test cases we can test them"
call mvn test
