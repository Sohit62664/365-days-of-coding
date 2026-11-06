### Question 1 Rocket Fuel Optimization

A scientist is designing a rocket and wants to maximize the total energy produced by the fuel loaded into the rocket.

There are **N different types of fuel**. For each fuel type `i`, three properties are given:

* `volume[i]` — the volume occupied by one unit of the fuel.
* `energy[i]` — the energy produced by one unit of the fuel.
* `mass[i]` — the mass of one unit of the fuel.

The rocket has two constraints:

* Maximum available **volume capacity** = `V`
* Maximum allowable **mass** = `M`

The scientist can select multiple fuel types, subject to the following conditions:

1. The total volume of the selected fuel must not exceed `V`.
2. The total mass of the selected fuel must not exceed `M`.
3. The objective is to **maximize the total energy** of the selected fuels.

Formally, choose a set of fuels such that:

$$
\sum volume[i] \leq V
$$

$$
\sum mass[i] \leq M
$$

while maximizing:

$$
\sum energy[i]
$$

### Input

* An integer `N`, representing the number of fuel types.
* An array `volume[]` of size `N`.
* An array `energy[]` of size `N`.
* An array `mass[]` of size `N`.
* An integer `V`, representing the maximum volume capacity.
* An integer `M`, representing the maximum mass capacity.

### Output

Return the **maximum possible total energy** that can be obtained without exceeding either the volume or mass constraint.

### Constraints

- 1 <= N
- 0 <= V
- 0 <= M
- 0 <= volume[i]
- 0 <= mass[i]
- 0 <= energy[i]
