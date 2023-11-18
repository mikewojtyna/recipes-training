# Fundraising service strategy
Take a look at [FundraisingService.java](..%2F..%2Fsrc%2Fmain%2Fjava%2Fpl%2Fwojtyna%2Ftrainings%2Frecipes%2Fcrowdsorcery%2Ftasks%2Ftask4%2Fservices%2FFundraisingService.java) class and `processProposal` method.

## Problems
What problems do you see? What would happen if new processing requirements are added frequently and become more and more complex? How would you change the `processProposal` method to make it more flexible?

## Your task
Create a new model supporting the following requirements.

1. Project verifiers can decide if proposal can be accepted or rejected based on multiple factors:
    - Project description
    - Project goal
    - Loan schedule
    - Interest rate
    - Borrower's credit score
    - And possibly many more...
2. Investors can invest into assets using investment strategies
   1. Manual into project
   2. Manual into asset
   3. Automated preset strategy
   4. Automated custom strategy
3. Interests paid to investors can change dynamically over the lifetime of a project. For example, the interest rate can depend on the country of the borrower, the amount of money already raised, the number of investors, etc.

Consider using the Policy building block.

### Extra
Do you see any other methods that could be refactored using the Strategy pattern?

### Solution
You can find solutions in the [solutions](..%2F..%2Fsrc%2Fmain%2Fjava%2Fpl%2Fwojtyna%2Ftrainings%2Frecipes%2Fcrowdsorcery%2Fsolutions) package.

## Discussion
- When do you introduce policies?
- What are the differences between stable and dynamic logic?
- What are the benefits of introducing policies?
- Are there any drawbacks of introducing policies?
- How does the introduction of the strategy affect the number of test cases that need to be verified?
- How does the introduction of the strategy affect the project's extensibility?
- Where do you see the SOLID: Open-Closed Principle being applied?
- Provide examples of projects you are working on where such a solution would be beneficial and justified